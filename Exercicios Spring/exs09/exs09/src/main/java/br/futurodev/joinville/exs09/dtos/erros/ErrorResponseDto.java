package br.futurodev.joinville.exs09.dtos.erros;

public record ErrorResponseDto(
        String code,
        String message,
        String cause,
        String exceptionClassName
) {
}
