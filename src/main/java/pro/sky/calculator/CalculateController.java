package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/calculator")
@RestController

public final class CalculateController {
    private CalculatorServiceImpl welcomeService;

    public CalculateController(CalculatorServiceImpl welcomeService) {
        this.welcomeService = welcomeService;
    }
    @GetMapping
    public String welcome() {
        return welcomeService.welcome();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.plus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.multiplication(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String division(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.division(num1, num2);
    }
}
