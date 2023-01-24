package com.portfolio.mfc.Controller;

import com.portfolio.mfc.Entity.Persona;
import com.portfolio.mfc.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="https://frontendportfoliomfc-12dd7.web.app")
@RestController
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    @CrossOrigin(origins ="https://frontendportfoliomfc-12dd7.web.app")
    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }

    @CrossOrigin(origins ="https://frontendportfoliomfc-12dd7.web.app")
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "La persona fue creada";
    }

    @CrossOrigin(origins ="https://frontendportfoliomfc-12dd7.web.app")
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada";
    }

    @CrossOrigin(origins ="https://frontendportfoliomfc-12dd7.web.app")
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("titulo") String nuevoTitulo,
            @RequestParam("descripcion") String nuevoDescripcion) {
        Persona persona = ipersonaService.findPersona(id);

        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setTitulo(nuevoTitulo);
        persona.setDescripcion(nuevoDescripcion);

        ipersonaService.savePersona(persona);
        return persona;
    }

    @CrossOrigin(origins ="https://frontendportfoliomfc-12dd7.web.app")
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona() {
        return ipersonaService.findPersona((long) 1);
    }
}