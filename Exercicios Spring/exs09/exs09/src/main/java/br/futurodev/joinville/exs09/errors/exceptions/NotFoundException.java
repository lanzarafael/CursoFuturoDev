package br.futurodev.joinville.exs09.errors.exceptions;

public abstract class NotFoundException extends RuntimeException {
    NotFoundException(String objectName, Long id) {
        super(objectName + " with id '" + id + "' not found");
    }
}
