package calculator2.calculator2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 невозможно");
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
