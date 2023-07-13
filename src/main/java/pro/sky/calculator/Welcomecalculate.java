package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class Welcomecalculate {
    private WelcomeserviceImpl welcomeService;

    public Welcomecalculate(WelcomeserviceImpl welcomeService) {
        this.welcomeService = welcomeService;
    }
    @GetMapping(path = "/calculator")
    public String welcome() {
        return welcomeService.welcome();
    }
    @GetMapping(path = "/calculator/plus")
    public String countValues(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.countValues(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String countValues1(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.countValues1(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String countValues2(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.countValues2(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String countValues3(@RequestParam int num1, @RequestParam int num2) {
        return welcomeService.countValues3(num1, num2);
    }
}
