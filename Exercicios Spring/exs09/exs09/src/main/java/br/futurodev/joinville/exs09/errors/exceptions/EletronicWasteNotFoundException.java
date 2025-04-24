package br.futurodev.joinville.exs09.errors.exceptions;

public class EletronicWasteNotFoundException extends NotFoundException {
    public EletronicWasteNotFoundException(Long id) {
        super("Eletronic waste", id);
    }
}
