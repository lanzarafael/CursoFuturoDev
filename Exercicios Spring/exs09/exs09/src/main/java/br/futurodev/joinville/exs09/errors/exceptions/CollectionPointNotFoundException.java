package br.futurodev.joinville.exs09.errors.exceptions;

public class CollectionPointNotFoundException extends NotFoundException {
    public CollectionPointNotFoundException(Long id) {
        super("Collection point", id);
    }
}
