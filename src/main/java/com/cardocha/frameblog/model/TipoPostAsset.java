package com.cardocha.frameblog.model;

import lombok.Getter;

@Getter
public enum TipoPostAsset {

    LINK(1, "LINK"),
    IMAGEM(2, "IMAGEM");

    TipoPostAsset(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    private final long id;
    private final String descricao;
}
