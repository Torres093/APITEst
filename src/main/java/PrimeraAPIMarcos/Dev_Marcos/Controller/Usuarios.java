package PrimeraAPIMarcos.Dev_Marcos.Controller;

import PrimeraAPIMarcos.Dev_Marcos.Models.DTO.DTOUsuarios;
import PrimeraAPIMarcos.Dev_Marcos.Models.Repository.InterfaceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/apiUsers")
@RestController
public class Usuarios {

    @Autowired
    private InterfaceUsuario acceso;

    @GetMapping("/getUsers")
    public List<DTOUsuarios> dataUsers(){
        return acceso.obtenerDatos();
    }

}
