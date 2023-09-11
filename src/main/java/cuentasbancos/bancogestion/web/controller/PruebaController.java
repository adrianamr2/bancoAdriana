/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbancos.bancogestion.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author amachacado@cx.local
 */
@RestController
@RequestMapping("/saludar")
public class PruebaController {
   @GetMapping("/hola")
    public String saludar(){

        return "Qllllo ";
    }
}
