public enum Kundor {
    DUISHOMBU("DUISHOMBU:TECHNICAL LESSON"),
    SHEISHEMBI("SHEISHEMBI:PRACTIC LESSON"),
    SHARSHEMBI("SHARSHEMBI:TECHNICAL LESSON AND ENGLISH"),
    BEISHEMBI("BEISHEMBI:PRACTIC LESSON AND SOFT SKILLS"),
    JUMA("JUMA:TECHNICAL LESSON AND IVENT"),
    ISHEMBI("ISHEMBI:DON'T HAVE A LESSON"),
    JEKSHEMBI("JEKSHEMBI:DON'T HAVE A LESSON");

    public String getKundorinKyrgyz() {
        return kundorinKyrgyz;
    }

    public void setKundorinKyrgyz(String kundorinKyrgyz) {
        this.kundorinKyrgyz = kundorinKyrgyz;
    }

    private String kundorinKyrgyz;
    Kundor(String kundorinKyrgyz){
    this.kundorinKyrgyz = kundorinKyrgyz;
    }
}