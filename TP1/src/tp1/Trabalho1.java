package tp1;

import java.util.Scanner;

public class Trabalho1 {

	public static void main(String[] args) {
		String [][][] cliente = new String[100][100][100];
    	String [][] produto = new String[100][100];
    	int [][][] produtoInt= new int[100][100][100];
    	int [] vendas= new int[100];
    	int menuEs, i, totalCli = 10, totalPro = 10, numeroCada = 0, numeroCadaF = 0, erro, escolhaCli, escolhaPro, vendido;
    	String procura;
        
        Scanner ler = new Scanner(System.in);
        
        
        cliente[0][0][0] = "Alexandre";
        cliente[0][1][0] = "rua 1";
        cliente[0][0][1] = "1111";
        
        cliente[1][1][1] = "André";
        cliente[1][2][1] = "rua 2";
        cliente[1][1][2] = "2222";
        
        cliente[2][2][2] = "Antônio";
        cliente[2][3][2] = "rua 3";
        cliente[2][2][3] = "3333";

        cliente[3][3][3] = "Caio";
        cliente[3][4][3] = "rua 4";
        cliente[3][3][4] = "4444";
        
        cliente[4][4][4] = "Cauã";
        cliente[4][5][4] = "rua 5";
        cliente[4][4][5] = "5555";
        
        cliente[5][5][5] = "Daniel";
        cliente[5][6][5] = "rua 6";
        cliente[5][5][6] = "6666";
        
        cliente[6][6][6] = "Eduardo";
        cliente[6][7][6] = "rua 7";
        cliente[6][6][7] = "7777";
        
        cliente[7][7][7] = "Felipe";
        cliente[7][8][7] = "rua 8";
        cliente[7][7][8] = "8888";
        
        cliente[8][8][8] = "Guilherme";
        cliente[8][9][8] = "rua 9";
        cliente[8][8][9] = "9999";
        
        cliente[9][9][9] = "Henrique";
        cliente[9][10][9] = "rua 10";
        cliente[9][9][10] = "10101010";
        
        for (i = 0; i < 10; i++) {
			produtoInt[i][i][i] = i;
			produtoInt[i][i+1][i] = i+i;
			produtoInt[i][i][i+1] = i+1000;
        }
    	produto[0][0] = "Lata";
    	produto[0][1] = "de metal";

    	produto[1][1] = "Smartphones";
    	produto[1][2] = " tem tela";

    	produto[2][2] = "Capinhas";
    	produto[2][3] = "para celulares";

    	produto[3][3] = "Sapatos";
    	produto[3][4] = "pro pe";
    	
    	produto[4][4] = "Camisas";
    	produto[4][5] = "pro corpo";
    	
    	produto[5][5] = "Lembrancinha";
    	produto[5][6] = "de festas";
    	
    	produto[6][6] = "Perfumes";
    	produto[6][7] = "cheiroso";
    	
    	produto[7][7] = "Jogos";
    	produto[7][8] = "divertido";
    	
    	produto[8][8] = "Tablets";
    	produto[8][9] = "celular grande";
    	
    	produto[9][9] = "Impressoras";
    	produto[9][10] = "Quem usa ainda?";

        
        System.out.print("Digite o caracter a ser verificado::\n");    
       do {
        System.out.print("-----------------------------------------------------\n");
        System.out.print("Digite o número do menu da opção que você quer:\n");
        System.out.print("1. Cadastro de novo cliente\n");
        System.out.print("2. Busca por cliente\n");
        System.out.print("3. Cadastro de novo produto\n");
        System.out.print("4. Busca por produto\n");
        System.out.print("5. Cadastro de venda\n");
        System.out.print("6. Mostrar produtos em estoque\n");
        System.out.print("7. Sair\n");
        System.out.print("-----------------------------------------------------\n");
        System.out.print("Número:");
    	menuEs = ler.nextInt();
    	
    	switch (menuEs) {
    		
    	case 1:
    		System.out.println("Quantos clientes seram cadastros:");
    		numeroCada = ler.nextInt();
    		numeroCadaF =totalCli +numeroCada;
    		for (i = totalCli; i < numeroCadaF; i++) {
    			i++;
    			System.out.println("Cliente numero "+i+":\n");
    			i--;
    			System.out.println("Nome:");
    			cliente[i][i][i] = ler.next();
    			System.out.println("endereço:");
    			cliente[i][i+1][i] = ler.next();
    			System.out.println("telefone:");
    			cliente[i][i][i+1] = ler.next();
    		}
        
        totalCli = totalCli +numeroCada;
    		break;
    		
    	case 2:
    		System.out.println("Qual cliente sera procurado:");
    		procura = ler.next();
    		erro = 0;
    		
    		for (i = 0; i < totalCli; i++) {
    			if (cliente[i][i][i].equals(procura)) {
    				
    				System.out.println("Nome:"+cliente[i][i][i]);
        			System.out.println("endereço:"+cliente[i][i+1][i]);
        			System.out.println("telefone:"+ cliente[i][i][i+1]);

        			System.out.println("Insira 1 para mudar ou outro numero para sair.");
        			erro = ler.nextInt();
        			if(erro == 1) {
        				System.out.println("Nome:");
            			cliente[i][i][i] = ler.next();
            			System.out.println("endereço:");
            			cliente[i][i+1][i] = ler.next();
            			System.out.println("telefone:");
            			cliente[i][i][i+1] = ler.next();
        			}
        		}
    		}
    		if(erro == 0) {
    			System.out.println("Cliente não encontrado!");
				
			}
    		System.out.println("Insira um numero para ir ao menu.");
			erro = ler.nextInt();
    		break;
    		
    	case 3:
    		System.out.println("Quantos produto seram cadastros:");
    		numeroCada = ler.nextInt();
    		numeroCadaF =totalPro +numeroCada;
    		
    		for (i = totalPro; i < numeroCadaF; i++) {
    			i++;
    			System.out.println("Produto numero "+i+":\n");
    			i--;
    			System.out.println("Nome do produto:");
    			produto[i][i] = ler.next();
    			System.out.println("Descrição:");
    			produto[i][i+1] = ler.next();
    			System.out.println("Valor de compra:");
    			produtoInt[i][i][i] = ler.nextInt();
    			System.out.println("Porcentagem de lucro em %:");
    			produtoInt[i][i+1][i] = ler.nextInt();
    			System.out.println("Quantidade em estoque:");
    			produtoInt[i][i][i+1] = ler.nextInt();
    		}
        
    		totalPro = totalPro +numeroCada;
    		break;
    		
    	case 4:
    		System.out.println("Qual produto sera procurado:");
    		procura = ler.next();
    		erro = 0;
    		
    		for (i = 0; i < totalPro; i++) {
    			if (produto[i][i].equals(procura)) {
    				
    				System.out.println("Nome:"+produto[i][i]);
        			System.out.println("Descrição:"+produto[i][i+1]);
        			System.out.println("Valor de compra:"+produtoInt[i][i][i]);
           			System.out.println("Porcentagem de lucro em %:"+produtoInt[i][i+1][i]);
           			System.out.println("Quantidade em estoque:"+produtoInt[i][i][i+1]);

        			System.out.println("Insira 1 para mudar ou outro numero para sair.");
        			erro = ler.nextInt();
        			if(erro == 1) {
        				System.out.println("Nome do produto:");
            			produto[i][i] = ler.next();
            			System.out.println("Descrição:");
            			produto[i][i+1] = ler.next();
            			System.out.println("Valor de compra:");
            			produtoInt[i][i][i] = ler.nextInt();
            			System.out.println("Porcentagem de lucro em %:");
            			produtoInt[i][i+1][i] = ler.nextInt();
            			System.out.println("Quantidade em estoque:");
            			produtoInt[i][i][i+1] = ler.nextInt();
        			}
        		}
    		}
    		if(erro == 0) {
    			System.out.println("Produto não encontrado!");
				
			}
    		System.out.println("Insira um numero para ir ao menu.");
			erro = ler.nextInt();
    		break;
    		
    	case 5:
    		
    		do {
    			for (i = 0; i < totalCli; i++) {
    				i++;
   					System.out.println("Cliente numero "+i+":"+cliente[i-1][i-1][i-1]);
   					i--;
   				}
   				System.out.print("Selecione um cliente:");    				
   				escolhaCli = ler.nextInt();
    		}while (escolhaCli > totalCli);
    		do {
    			do {
    				for (i = 0; i < totalPro; i++) {
    					i++;
    					System.out.println("Produto numero "+i+":"+produto[i-1][i-1]);
    					i--;
    			}
        		System.out.print("Selecione um produto:");
        		escolhaPro = ler.nextInt();
        		}while (escolhaPro > totalCli);
    			do {
    				erro= 0;
    				System.out.print("Quantidade de "+produto[escolhaPro-1][escolhaPro-1]+ " que foi vendida para "+cliente[escolhaCli-1][escolhaCli-1][escolhaCli-1]+":");
    				vendido = ler.nextInt();
    				if (vendido > produtoInt[escolhaPro-1][escolhaPro-1][escolhaPro]) {
    					erro= 1;
    					System.out.println("Quantidade em estoque:"+produtoInt[escolhaPro-1][escolhaPro-1][escolhaPro]);
    				}
    			}while (erro != 0);
    			produtoInt[escolhaPro-1][escolhaPro-1][escolhaPro] = produtoInt[escolhaPro-1][escolhaPro-1][escolhaPro] - vendido;
    			vendas [escolhaCli-1] = vendas [escolhaCli-1] + vendido;
    			System.out.print("Insira o numero 1 para voltar ao menu ou outro para cadastrar mais vendas para "+cliente[escolhaCli-1][escolhaCli-1][escolhaCli-1]+":");
    			erro = ler.nextInt();
    		}while (erro != 1 );
    		
    		break;
    		
    	case 6:
    		
    		for (i = 0; i < totalPro; i++) {
    			System.out.println("Nome:"+produto[i][i]+". Quantidade em estoque:"+produtoInt[i][i][i+1]);
        	}
    		System.out.println("Insira um numero para ir ao menu.");
			erro = ler.nextInt();
    		break;
    		
    	case 7:
    		break;
    		
    	default:
    		System.out.println("Número invalido");
    		
    		break;
    	
    	}
       }while (menuEs !=7);
    }
}
