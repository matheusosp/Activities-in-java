package paridade;

public class Paridade {
    int lenSeq;
    String seq1[];
    String seq2[];
    String col[];
    String arr[];
    public String numParidade(String []arr) {
        int cont = 0;
        for (String arr1 : arr) {
            if (arr1 != null) {
                if (arr1.equals("1")) {
                    cont++;
                }
            }
        }
        
        return cont%2==0?"0":"1";
    }
        
    public void criaParidadeBloco(String arr[]) {
        this.arr = arr;
        this.lenSeq = (int)arr.length/2;
        this.seq1= new String[lenSeq+1];
        this.seq2 = new String[lenSeq+1];
        this.col = new String[lenSeq+1];
        int j = 0;
        for (int i = 0; i < lenSeq; i++) {
            this.seq1[i] = arr[j];
            this.seq2[i] = arr[lenSeq+j];
            j++;
            if(i+1==lenSeq){
                this.seq1[i+1] = numParidade(this.seq1);
                this.seq2[i+1] = numParidade(this.seq2);                
            }
        }
        String colTemp[] = new String[2];
        for (int i = 0; i < lenSeq+1; i++) {
            colTemp[0] = seq1[i];
            colTemp[1] = seq2[i];
            this.col[i] = numParidade(colTemp);
        }
    }
    public void verificaParidade() {
        String seq1Temp[] = new String[lenSeq];
        System.arraycopy(this.seq1, 0, seq1Temp, 0, lenSeq);
        String seq2Temp[] = new String[lenSeq];
        System.arraycopy(this.seq2, 0, seq2Temp, 0, lenSeq);
        if(numParidade(seq1Temp)!=this.seq1[this.lenSeq]){
            System.out.println("Erro detectado na primeira sequencia");
        }
        if(numParidade(seq2Temp)!=this.seq2[this.lenSeq]){
            System.out.println("Erro detectado na segunda sequencia");
        }
        String colTemp[] = new String[2];
        for (int i = 0; i < lenSeq+1; i++) {
            colTemp[0] = this.seq1[i];
            colTemp[1] = this.seq2[i];
            if(numParidade(colTemp)!=this.col[i]){
                System.out.println("Erro na terceira sequencia, na coluna "+i);
            }
        }
    }
    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public int getLenSeq() {
        return lenSeq;
    }

    public void setLenSeq(int lenSeq) {
        this.lenSeq = lenSeq;
    }

    public String[] getSeq1() {
        return seq1;
    }

    public void setSeq1(String[] seq1) {
        this.seq1 = seq1;
    }

    public String[] getSeq2() {
        return seq2;
    }

    public void setSeq2(String[] seq2) {
        this.seq2 = seq2;
    }

    public String[] getCol() {
        return col;
    }

    public void setCol(String[] col) {
        this.col = col;
    }
    
}
