package git.fatihy101.currencyconverter.controller;

import git.fatihy101.currencyconverter.service.ConverterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class ConverterController {
    private final ConverterService service;

    @GetMapping("/usd_try_converter")
    public ResponseEntity<String> convertCurrency(@RequestParam String source, @RequestParam double number) {
        return ResponseEntity.ok(service.convertCurrency(source, number));
    }
}
