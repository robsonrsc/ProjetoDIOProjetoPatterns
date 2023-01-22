package br.com.dio.Projeto_Intermediario.Controller;


import br.com.dio.Projeto_Intermediario.Service.ClienteService;
import br.com.dio.Projeto_Intermediario.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteServiceController {

    @Autowired
    private ClienteService clienteService ;

    @GetMapping
    public ResponseEntity <Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping ("/id")
    public ResponseEntity <Cliente> buscarId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarId(id));
    }
    @PostMapping

    public  ResponseEntity <Cliente> inserir(@RequestBody Cliente cliente){

        clienteService.Inserir(cliente);
        return  ResponseEntity.ok(cliente);
    }

    @PutMapping ("/{id}")

    public ResponseEntity <Cliente> atualizar (@PathVariable Long id, @RequestBody Cliente cliente){

        clienteService.atualizar(id,cliente);
        return ResponseEntity.ok(cliente);
    }


}
