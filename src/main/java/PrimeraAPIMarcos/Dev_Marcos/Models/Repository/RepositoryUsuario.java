package PrimeraAPIMarcos.Dev_Marcos.Models.Repository;

import PrimeraAPIMarcos.Dev_Marcos.Models.DTO.DTOUsuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

@Transactional
public class RepositoryUsuario implements InterfaceUsuario {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<DTOUsuarios> obtenerDatos(){
        String query = "FROM DTOUsuario";
        return entityManager.createQuery(query).getResultList();
    }

}
