package PrimeraAPIMarcos.Dev_Marcos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/apiUsers")
@RestController
public class Usuarios {
    @GetMapping("/getUsers")
    public List<DTOUsuarios> dataUsers(){

    }

}
