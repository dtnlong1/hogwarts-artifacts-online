package edu.tcu.cs.hogwartsartifactsonline.wizard;

import edu.tcu.cs.hogwartsartifactsonline.system.Result;
import edu.tcu.cs.hogwartsartifactsonline.system.StatusCode;
import edu.tcu.cs.hogwartsartifactsonline.wizard.converter.WizardDtoToWizardConverter;
import edu.tcu.cs.hogwartsartifactsonline.wizard.converter.WizardToWizardDtoConverter;
import edu.tcu.cs.hogwartsartifactsonline.wizard.dto.WizardDto;
import jakarta.validation.Valid;
import jdk.jshell.Snippet;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("${api.endpoint.base-url}/wizards")
public class WizardController {
    private final WizardService wizardService;
    private final WizardToWizardDtoConverter wizardToWizardDtoConverter;
    private final WizardDtoToWizardConverter wizardDtoToWizardConverter;

    public WizardController(WizardService wizardService, WizardToWizardDtoConverter wizardToWizardDtoConverter, WizardDtoToWizardConverter wizardDtoToWizardConverter) {
        this.wizardService = wizardService;
        this.wizardToWizardDtoConverter = wizardToWizardDtoConverter;
        this.wizardDtoToWizardConverter = wizardDtoToWizardConverter;
    }

    @GetMapping
    public Result findWizards() {
        List<Wizard> foundWizards = this.wizardService.findAll();
        List<WizardDto> wizardDtos = foundWizards.stream()
                .map(this.wizardToWizardDtoConverter::convert)
                .collect(Collectors.toList());
        return new Result(true, StatusCode.SUCCESS, "Find All Success", wizardDtos);
    }
    @GetMapping("/{wizardId}")
    public Result findWizardById(@PathVariable Integer wizardId) {
        Wizard foundWizard = this.wizardService.findById(wizardId);
        WizardDto wizardDto = this.wizardToWizardDtoConverter.convert(foundWizard);
        return new Result(true, StatusCode.SUCCESS, "Find One Success", wizardDto);
    }
    @PostMapping
    public Result addWizard(@Valid @RequestBody WizardDto wizardDto) {
        Wizard newWizard = this.wizardDtoToWizardConverter.convert(wizardDto);
        Wizard savedWizard = this.wizardService.save(newWizard);
        WizardDto savedWizardDto = this.wizardToWizardDtoConverter.convert(savedWizard);
        return new Result(true, StatusCode.SUCCESS, "Add Success", savedWizardDto);
    }
    @PutMapping("/{wizardId}")
    public Result updateWizard(@PathVariable Integer wizardId, @Valid @RequestBody WizardDto wizardDto) {
        Wizard update = this.wizardDtoToWizardConverter.convert(wizardDto);
        Wizard updatedWizard = this.wizardService.update(wizardId, update);
        WizardDto updatedWizardDto = this.wizardToWizardDtoConverter.convert(updatedWizard);
        return new Result(true, StatusCode.SUCCESS, "Update Success", updatedWizardDto);
    }
    @DeleteMapping("/{wizardId}")
    public Result deleteWizard(@PathVariable Integer wizardId) {
        this.wizardService.delete(wizardId);
        return new Result(true, StatusCode.SUCCESS, "Delete Success");
    }
    @PutMapping("/{wizardId}/artifacts/{artifactId}")
    public Result assignArtifact(@PathVariable Integer wizardId, @PathVariable String artifactId) {
        this.wizardService.assignArtifact(wizardId, artifactId);
        return new Result(true, StatusCode.SUCCESS, "Artifact Assignment Success");
    }

}
