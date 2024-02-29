package primeiro.primeiro.controller;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
    
@RestController
@RequestMapping("primeiroControler")
public class primeiroControler {
    
    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo() {
        return "Meu primeiro metodo funciona";
    }

    @GetMapping("segundoMetodo/{id}")
    public String segundoMetodo(@PathVariable String id) {
        return "O parametro é " + id;
    }

    @GetMapping("terceiroMetodo")
    public String terceiroMetodo(@RequestParam String id, @RequestParam String nome) {
        return "O parametro é " + id + " " + nome;
    }

    @GetMapping("quartoMetodo")
    public String quartoMetodo(@RequestParam Map<String, String> allParam) {
        return "O parametro é " + allParam.entrySet();
    }
    
    @PostMapping("quintoMetodo")
    public String quintoMetodo(@RequestBody Usuario usuario) {
        
        return usuario.username;
    }

    record Usuario(String username) {}

    @PostMapping("sextoMetodo")
    public String sextoMetodo(@RequestHeader Map<String, String> headers) {

        return "Metodo RequestHeader" + headers.entrySet();
    }
    
    
    
    
}
