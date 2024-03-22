// Modo condicional convencional
public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "T";

        //if(plano == "B"){
            //System.out.println("Basic: 100 Minutos de Ligação");
        //}
        //else if(plano == "M"){
            //System.out.println("100 Minutos Ligação");
            //System.out.println("WhatsApp e Instagram Grátis");
        //}
        //else if(plano == "T"){
            //System.out.println("100 Minutos de Ligação");
            //System.out.println("WhatsApp e Instagram");
            //System.out.println("YouTube Grátis");
        //}
        
        //Controle Switch Case Complementar
        switch (plano) {
            case "T": {
                System.out.println("5GB YouTube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram");
            }
            case "B":{
                System.out.println("100 Minutos Ligação");
            }
        }
	}

}
