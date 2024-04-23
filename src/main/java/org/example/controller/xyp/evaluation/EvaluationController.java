package org.example.controller.xyp.evaluation;

import org.example.service.TestService;
import org.example.vo.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xyp/evaluation")
public class EvaluationController {
    @Autowired
    private TestService testService;

    @GetMapping("/evaluationIntroduceTest")
    public BaseResult evaluationIntroduceTest() {
        return testService.evaluationIntroduceTest();
    }

    @GetMapping("/evaluationContentTest")
    public BaseResult evaluationContentTest() {
        return testService.evaluationContentTest();
    }

    @GetMapping("/evaluationResultTest")
    public BaseResult evaluationResultTest() {
        return testService.evaluationResultTest();
    }

    @GetMapping("/evaluationTalentResultTest")
    public BaseResult evaluationTalentResultTest() {
        return testService.evaluationTalentResultTest();
    }


}
