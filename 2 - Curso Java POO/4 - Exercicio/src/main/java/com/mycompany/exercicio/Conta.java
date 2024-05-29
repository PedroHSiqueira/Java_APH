package com.mycompany.exercicio;

public class Conta {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);

        if ("CC".equals(t) || "cc".equals(t)) {
            saldo += 50;
        } else if ("CP".equals(t) || "cp".equals(t)) {
            saldo += 150;
        }

        status = true;
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("A conta possui Dinheiro");
        } else if (this.saldo < 0) {
            System.out.println("Conta em Débito");
        } else {
            setStatus(false);
        }

    }

    public void depositar(float valor) {
        if (this.status) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float valor) {
        if (this.status && this.saldo > valor) {
            setSaldo(getSaldo() + valor);
        }else{
            System.out.println("Impossivel Sacar");
        }
    }

    public void pagarMensal(String t) {
        if ("CC".equals(t) || "cc".equals(t)) {
            saldo -= 12.0f;
            System.out.println("Pagamento realizado: R$12.00");
        } else if ("CP".equals(t) || "cp".equals(t)) {
            saldo -= 20.0f;
            System.out.println("Pagamento realizado: R$20.00");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
