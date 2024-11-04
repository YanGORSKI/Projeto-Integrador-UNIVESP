package com.univesp.sistemainternoadra.model.DTO.pessoas;

import com.univesp.sistemainternoadra.model.DAO.pessoas.FamiliaBens;

public class FamiliaBensDTO {
    private Long id;
    private Boolean hasSofa;
    private Integer qtdSofa;
    private Boolean hasTV;
    private Integer qtdTV;
    private Boolean hasDVD;
    private Boolean hasInternet;
    private Boolean hasComputador;
    private Integer qtdComputador;
    private Boolean hasAparelhoSom;
    private Integer qtdAparelhoSom;
    private Boolean hasNotebook;
    private Integer qtdNotebook;
    private Boolean hasFogao;
    private Integer qtdBocasFogao;
    private Boolean hasArmarioCozinha;
    private Integer qtdArmarioCozinha;
    private Boolean hasMesa;
    private Integer qtdMesa;
    private Boolean hasCadeira;
    private Integer qtdCadeira;
    private Boolean hasLavaLouca;
    private Integer qtdLavaLouca;
    private Boolean hasGeladeira;
    private Integer qtdGeladeira;
    private Boolean hasFiltro;
    private Integer qtdFiltro;
    private Boolean hasFreezer;
    private Integer qtdFreezer;
    private Boolean hasMicroondas;
    private Integer qtdMicroondas;
    private Boolean hasCama;
    private Integer qtdCama;
    private Boolean hasGuardaRoupa;
    private Integer qtdGuardaRoupa;
    private Boolean hasEscrivaninha;
    private Integer qtdEscrivaninha;
    private Boolean hasComoda;
    private Integer qtdComoda;
    private Boolean hasVasoSanitario;
    private Integer qtdVasoSanitario;
    private Boolean hasChuveiro;
    private Integer qtdChuveiro;
    private Boolean hasAzulejo;
    private Boolean hasBox;
    private Integer qtdBox;
    private Boolean hasArmarioBanheiro;
    private Integer qtdArmarioBanheiro;

    public FamiliaBensDTO(FamiliaBens familiaBens) {
        this.id = familiaBens.getId();
        this.hasSofa = familiaBens.getHasSofa();
        this.qtdSofa = familiaBens.getQtdSofa();
        this.hasTV = familiaBens.getHasTV();
        this.qtdTV = familiaBens.getQtdTV();
        this.hasDVD = familiaBens.getHasDVD();
        this.hasInternet = familiaBens.getHasInternet();
        this.hasComputador = familiaBens.getHasComputador();
        this.qtdComputador = familiaBens.getQtdComputador();
        this.hasAparelhoSom = familiaBens.getHasAparelhoSom();
        this.qtdAparelhoSom = familiaBens.getQtdAparelhoSom();
        this.hasNotebook = familiaBens.getHasNotebook();
        this.qtdNotebook = familiaBens.getQtdNotebook();
        this.hasFogao = familiaBens.getHasFogao();
        this.qtdBocasFogao = familiaBens.getQtdBocasFogao();
        this.hasArmarioCozinha = familiaBens.getHasArmarioCozinha();
        this.qtdArmarioCozinha = familiaBens.getQtdArmarioCozinha();
        this.hasMesa = familiaBens.getHasMesa();
        this.qtdMesa = familiaBens.getQtdMesa();
        this.hasCadeira = familiaBens.getHasCadeira();
        this.qtdCadeira = familiaBens.getQtdCadeira();
        this.hasLavaLouca = familiaBens.getHasLavaLouca();
        this.qtdLavaLouca = familiaBens.getQtdLavaLouca();
        this.hasGeladeira = familiaBens.getHasGeladeira();
        this.qtdGeladeira = familiaBens.getQtdGeladeira();
        this.hasFiltro = familiaBens.getHasFiltro();
        this.qtdFiltro = familiaBens.getQtdFiltro();
        this.hasFreezer = familiaBens.getHasFreezer();
        this.qtdFreezer = familiaBens.getQtdFreezer();
        this.hasMicroondas = familiaBens.getHasMicroondas();
        this.qtdMicroondas = familiaBens.getQtdMicroondas();
        this.hasCama = familiaBens.getHasCama();
        this.qtdCama = familiaBens.getQtdCama();
        this.hasGuardaRoupa = familiaBens.getHasGuardaRoupa();
        this.qtdGuardaRoupa = familiaBens.getQtdGuardaRoupa();
        this.hasEscrivaninha = familiaBens.getHasEscrivaninha();
        this.qtdEscrivaninha = familiaBens.getQtdEscrivaninha();
        this.hasComoda = familiaBens.getHasComoda();
        this.qtdComoda = familiaBens.getQtdComoda();
        this.hasVasoSanitario = familiaBens.getHasVasoSanitario();
        this.qtdVasoSanitario = familiaBens.getQtdVasoSanitario();
        this.hasChuveiro = familiaBens.getHasChuveiro();
        this.qtdChuveiro = familiaBens.getQtdChuveiro();
        this.hasAzulejo = familiaBens.getHasAzulejo();
        this.hasBox = familiaBens.getHasBox();
        this.qtdBox = familiaBens.getQtdBox();
        this.hasArmarioBanheiro = familiaBens.getHasArmarioBanheiro();
        this.qtdArmarioBanheiro = familiaBens.getQtdArmarioBanheiro();
    }

    // Getters e Setters
}