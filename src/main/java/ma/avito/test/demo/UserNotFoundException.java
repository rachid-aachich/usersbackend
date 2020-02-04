package ma.avito.test.demo;

class UserNotFoundException extends RuntimeException {

    UserNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}