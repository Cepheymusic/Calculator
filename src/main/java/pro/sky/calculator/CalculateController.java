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
    public String countValues(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.countValues(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String countValues1(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.countValues1(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String countValues2(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.countValues2(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String countValues3(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.countValues3(num1, num2);
    }
}
