package quickbucks;

import org.springframework.data.repository.CrudRepository;

import quickbucks.Request;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface RequestRepository extends CrudRepository<Request, Long> {

}
