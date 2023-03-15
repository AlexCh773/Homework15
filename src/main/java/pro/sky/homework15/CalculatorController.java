package pro.sky.homework15;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String greeting() {
        return CalculatorService.greeting();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (!calculatorService.checkParameters(num1, num2)) {
            return "неверно указаны параметры в запросе!";
        }
        return num1 + " + " + num2 + " = " + calculatorService.addition(num1, num2);
    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (!calculatorService.checkParameters(num1, num2)) {
            return "неверно указаны параметры в запросе!";
        }
        return num1 + " - " + num2 + " = " + calculatorService.subtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (!calculatorService.checkParameters(num1, num2)) {
            return "неверно указаны параметры в запросе!";
        }
        return num1 + " * " + num2 + " = " + calculatorService.multiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String division(@RequestParam(required = false) Double num1, @RequestParam(required = false) Double num2) {
        if (!calculatorService.checkParameters(num1, num2)) {
            return "неверно указаны параметры в запросе!";
        }
        return num1 + " / " + num2 + " = " + ((num2 == 0) ? "ошибка деления на ноль!" : calculatorService.division(num1, num2));
    }
}
