public class MorseCode {
    Node head = new Node(""); //Constructs the head node, which is empty
    Tre tree = new Tre(head); //Constructs a new tree
    
    /**
     * Sets up a morse code tre
     */
    MorseCode() {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        Node H = new Node("H");
        Node I = new Node("I");
        Node J = new Node("J");
        Node K = new Node("K");
        Node L = new Node("L");
        Node M = new Node("M");
        Node N = new Node("N");
        Node O = new Node("O");
        Node P = new Node("P");
        Node Q = new Node("Q");
        Node R = new Node("R");
        Node S = new Node("S");
        Node T = new Node("T");
        Node U = new Node("U");
        Node V = new Node("V");
        Node W = new Node("W");
        Node X = new Node("X");
        Node Y = new Node("Y");
        Node Z = new Node("Z");
        Node ONE = new Node("1");
        Node TWO = new Node("2");
        Node THREE = new Node("3");
        Node FOUR = new Node("4");
        Node FIVE = new Node("5");
        Node SIX = new Node("6");
        Node SEVEN = new Node("7");
        Node EIGHT = new Node("8");
        Node NINE = new Node("9");
        Node ZERO = new Node("0");
        Node DAH1 = new Node("-");
        Node DAH2 = new Node("-");
        Node DIT = new Node(".");
        
        E.setLeft(A);
        D.setRight(B);
        K.setRight(C);
        N.setRight(D);
        head.setRight(E);
        U.setRight(F);
        M.setRight(G);
        S.setRight(H);
        E.setRight(I);
        W.setLeft(J);
        N.setLeft(K);
        R.setRight(L);
        T.setLeft(M);
        T.setRight(N);
        M.setLeft(O);
        W.setRight(P);
        G.setLeft(Q);
        A.setRight(R);
        I.setRight(S);
        head.setLeft(T);        
        I.setLeft(U);
        S.setLeft(V);
        A.setLeft(W);
        D.setLeft(X);
        K.setLeft(Y);
        G.setRight(Z);
        J.setLeft(ONE);
        DAH2.setLeft(TWO);
        V.setLeft(THREE);        
        H.setLeft(FOUR);
        H.setRight(FIVE);
        B.setRight(SIX);
        Z.setRight(SEVEN);
        DIT.setRight(EIGHT);
        DAH1.setRight(NINE);
        DAH1.setLeft(ZERO);
        O.setLeft(DAH1);
        U.setLeft(DAH2);
        O.setRight(DIT);
    }
    
    public String translate(String str) {
        String out = "";
        
        if (str.length() == 0) {
            return out;
         }
        else {
            
        }
        
        return out;
    }
}
