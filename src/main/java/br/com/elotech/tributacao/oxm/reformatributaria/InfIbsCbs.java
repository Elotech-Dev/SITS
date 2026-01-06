package br.com.elotech.tributacao.oxm.reformatributaria;

public class InfIbsCbs {

    private Integer finNFSe;
    private Integer indFinal;
    private Integer cindOp;
    private Integer tpOper;

    private GRefNFSe grefNFSe;
    private Integer tpEnteGov;
    private Integer indDest;

    private Destinatario destinatario;

    private Imovel imovel;

    private ValoresInfIbsCbs valoresIbsCbs;

    public Integer getFinNFSe() {
        return finNFSe;
    }

    public void setFinNFSe(Integer finNFSe) {
        this.finNFSe = finNFSe;
    }

    public Integer getIndFinal() {
        return indFinal;
    }

    public void setIndFinal(Integer indFinal) {
        this.indFinal = indFinal;
    }

    public Integer getCindOp() {
        return cindOp;
    }

    public void setCindOp(Integer cindOp) {
        this.cindOp = cindOp;
    }

    public Integer getTpOper() {
        return tpOper;
    }

    public void setTpOper(Integer tpOper) {
        this.tpOper = tpOper;
    }

    public GRefNFSe getGrefNFSe() {
        return grefNFSe;
    }

    public void setGrefNFSe(GRefNFSe grefNFSe) {
        this.grefNFSe = grefNFSe;
    }

    public Integer getTpEnteGov() {
        return tpEnteGov;
    }

    public void setTpEnteGov(Integer tpEnteGov) {
        this.tpEnteGov = tpEnteGov;
    }

    public Integer getIndDest() {
        return indDest;
    }

    public void setIndDest(Integer indDest) {
        this.indDest = indDest;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public ValoresInfIbsCbs getValoresIbsCbs() {
        return valoresIbsCbs;
    }

    public void setValoresIbsCbs(ValoresInfIbsCbs valoresIbsCbs) {
        this.valoresIbsCbs = valoresIbsCbs;
    }
}
