public class ArvoreBinariaMorse {

    public Nodo raiz;

    public ArvoreBinariaMorse(){

        this.raiz = new Nodo("");

    }

    public void inserir(String codigoMorse, String caractere){

        Nodo noAtual = raiz;
        int contagem = 0;

        for (int i = 0; i < codigoMorse.length(); i++){

            char comando = codigoMorse.charAt(i);
            contagem += 1;

            if (comando == '.'){
                if(noAtual.filho_esquerdo == null){
                    if (contagem == codigoMorse.length()){

                    noAtual.filho_esquerdo = new Nodo(caractere);
                    return;

                    } else{

                        noAtual.filho_esquerdo = new Nodo("Não possui caractere para essa combinação");
                        noAtual = noAtual.filho_esquerdo;
                    }
                }else if(contagem == codigoMorse.length()){

                    noAtual.filho_esquerdo = new Nodo(caractere);

                }else {

                    noAtual = noAtual.filho_esquerdo;

                }
            } else if (comando == '-') {
                if(noAtual.filho_direito == null){
                    if (contagem == codigoMorse.length()){

                        noAtual.filho_direito = new Nodo(caractere);
                        return;

                    } else{

                        noAtual.filho_direito = new Nodo("Não possui caractere para essa combinação");
                        noAtual = noAtual.filho_direito;

                    }
                }else {

                    noAtual = noAtual.filho_direito;

                }
            }else {

                System.out.println("Por favor só insira valores com . ou -");

            }
        }
    }

    public void buscar(String codigoMorse){

        Nodo noAtual = raiz;
        int contagem = 0;
        String frase = "";

        for (int i = 0; i < codigoMorse.length(); i++) {

            char comando = codigoMorse.charAt(i);
            contagem += 1;

            if (comando == '.') {
                if (noAtual.filho_esquerdo == null) {

                    System.out.println("Uma sequencia inexistente foi inserida, por favor revise o codigo morse");
                    return;

                } else {

                    noAtual = noAtual.filho_esquerdo;

                    if (contagem == codigoMorse.length()){

                        frase += noAtual.caractere;
                        System.out.println(frase);
                        return;

                    }
                }

            }else if (comando == '-') {
                if (noAtual.filho_direito == null) {

                    System.out.println("Uma sequencia inexistente foi inserida, por favor revise o codigo morse");
                    return;

                } else {

                    noAtual = noAtual.filho_direito;

                    if (contagem == codigoMorse.length()){

                        frase += noAtual.caractere;
                        System.out.println(frase);
                        return;

                    }

                }

            } else if (comando == ' ') {

                frase += noAtual.caractere;
                noAtual = raiz;


            } else if (comando == '/') {

                frase += " ";

            }


        }
    }

}


