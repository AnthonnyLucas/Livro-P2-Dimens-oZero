//Olá esse programa foi desenvolvido para exercer a mesma finalidade de um livro.
import java.util.Scanner;

class Livro {
        private static String anObject;
        {

        }

        /**
         * @param args
         */

        //Nesse livro contaremos a história do invocador.

        public static void main(String[] args) {
                System.out.println("Olá invocador, você foi inserido em um banco de dados, e foi teleportado para essa dimensão alternativa.\n");
                System.out.println("A partir desse momento o seu objetivo principal é conseguir evoluir nesse novo mundo.\n");
                System.out.println("Tente progredir a um nivel que você possa retornar para a sua dimensão.\n");
                System.out.println("SEJÁ BEM VINDO A DIMENSÃO ZERO.\n");
                System.out.println("BOA SORTE, VOCÊ VAI PRECISAR!!!\n");

                // Nesse treicho foi criado as variaveis e definido o seu formato.

                String nome;
                String classe;
                String gênero;
                String escolha;

                // Nesse trecho o evocador ira informar o seu nome.

                Scanner invocador = new Scanner(System.in);
                System.out.println("invocador digite como você quer se chamar.\n");
                nome = invocador.nextLine();

                // Nesse trecho o evocador ira informar a classe escolhida.

                Scanner tipo = new Scanner(System.in);
                System.out.println("Escolha a sua clase: Bárbaro, Paladino, Mago, Arqueiro ou Assasino. Digite abaixo a classe escolhida\n");
                classe = tipo.nextLine();

                // Nesse trecho o evocador ira informar o seu genero.

                Scanner sexo = new Scanner(System.in);
                System.out.println("Agora informe o seu gênero: Masculino ou Feminino. Digite abaixo o seu gênero.\n");
                gênero = sexo.nextLine();

                // Agora sera contada a história.

                System.out.println("Agora a sua história se inicia" + nome + "o maior" + classe + "de todos os tempos.\n\n");

                // Primeira parte da história.

                System.out.println("Em um certo momento um jovem" + classe + "foi teleportado para a Dimensão Zero, esse " + classe + "foi citado nas antigas profecias que ele poderia trazer a paz ou a distruição de toda a dimensão zero. ");
                System.out.println( "E foi profetizado que com a chegada dele, um ser maligno e muito antigo e poderoso, que foi selado nessa dimensão tambem ressurgiria das trevas.");
                System.out.println("Com seu exercito de monstros e com poder quase ilimitado, para tentar destruir toda a Dimensão Zero, e se alimentaria de todos os núcleos existente na dimensão...");
                System.out.println("Assim que chegou na Dimensão Zero o jovem" + classe + "viu um vilarejo distante, ao pé de uma montanha. Como ele não conhecia nada ali, se apressou para tentar chegar ao vilarejo antes do anoitecer, e assim ele fez.");
                System.out.println("Assim que chegou na vila ele foi bem tratado pelos moradores e já foram convidando ele para se abrirgar e passar a noite ali mesmo, pois já estava muito tarde e a Floresta Negra era muito perigosa.");
                System.out.println("Com o amanhecer todos da casa acordaram e foram tomar o café da manhã, após a refeição o"+ classe + "se despediu e agradeceu por toda hopitalidade que recebeu, e prometeu que voltaria algum dia para visitar seus novos amigos.");
                System.out.println("Assim que estava entrando na floresta Negra ele notou que um senhor estava sendo atacado por um grupo de orcs, assim que o senhor notou que ele estava ali, pediu pela sua ajuda.\n");

                // primeira escolha.

                // primeiro if.
                Scanner esc = new Scanner(System.in);
                System.out.println("Você se pergunta, se vai ajudar o senhor? Você pretende ajudar ele ?\n Se sim:Digite S!\n Se não:Digite N!\n\n");
                escolha = esc.nextLine();

                if (escolha.equals("S")) {
                        Scanner escolha1 = new Scanner(System.in);
                        String escolha2;

                        System.out.println("Estou indo ajudar o senhor não se preocupe.");
                        System.out.println("O senhor falou para ele que era O Mago Supremo, mas que para se salvar daquele ataque prescisaria do seu cajádo, que tinha sido roubado dele a alguns instantes, ele mandou o" + classe + "procurar e levar até ele, assim ele lidaria com os orcs facilmente.");
                        System.out.println("O jovem" + classe + "não perdeu tempo e foi a procura do cajado, e viu que um orc estava com ele, então ele lutou bravamente com o orc até conseguir derrotalo e recuperar o cajádo, assim ele foi correndo o mais rápido possivel para entregar o cajádo ao seu dono.");
                        System.out.println("Assim que o mago recuperou o seu cajádo ela lidou rapidamento com todos os orcs, e agradeceu ao jovem por telo ajudado");
                        System.out.println("Ele falou que tinha uma recompensa para o Jovem" + classe + "que salvou a sua vida. Assim ele entregou um ovo místico para o jovem e falou para ele cuidar muito bem daquele presente, pois era um simples ovo, mas quando chocasse uma criatura muito leal e forte nasceria para ajudalo.");
                        System.out.println("O jovem Agradeceu pelo presente mas falou que não poderia aceitar uma coisa tão valiosa dessa forma, mas O Mago Supremo falou que o seu destino já estava ligado com aquele ovo místico a muito tempo.");
                        System.out.println("Então ele explicou a profecia ao jovem, e disse que se ele quisesse se tornar mais forte para voltar para a sua dimensão, ele teria que derrotar o Feiticeiro Maligno, por que ele estava desequilibrando os nucleos entre esses mundos.");
                        System.out.println("O Mago Supremo falou para ele que teria três caminhos para chegar até o local onde o Feiticeiro Maligno estava.");
                        System.out.println("E o Jovem" + classe + "que escolheria oque ele achasse melhor.\n");
                        System.out.println("Tinha o caminho que passava pelo Vulcão Ancestral.");
                        System.out.println("Tinha o caminho que passava pelas Montalhas do Desespero.");
                        System.out.println("E tinha o caminho que seguia pela FLorsta Negra.\n");
                        System.out.println("Por qual dos caminhos vocês vai meu jovem ?\n CAMINHOS: VULCÃO ANCESTRAL: Digite V.\n FLORESTA NEGRA: Digite F.\n MONTANHAS DO DESESPERO : Digite M.\n\n");
                        escolha2 = escolha1.nextLine();

                        // Segunda escolha.

                        // Criação do segundo if. Vulcão
                        if (escolha2.equals("V")) {
                                System.out.println("Eu irei pelo Vulcão Ancestral, por que acho que poderei me aventurar bastante pelo caminho, e conseguir melhorar minhas habilidades.");
                                System.out.println("E assim o jovem" + classe + "começou a trilhar a sua história para conseguir derrotar o Feiticeiro Maligno, e conseguir renovar a paz na Dimenssão Zero.");
                                System.out.println("Ele se despediu do Mago Supremo e começou a sua jornada.");
                                System.out.println("Ele percebeu que a cada dia mais que se passava, mas o Ovo Místico que ele tinha recebido se mexia, em meio a uma batalha muito importante o ovo começou a rachar, e dele saiu um Dragão Alado que o ajudou a ganhar essa batalha.");
                                System.out.println("Assim que a batalha terminou o jovem percebeu que ele tinha se tornado mais forte, e que o Dragão Alado era muito leal a ele.");
                                System.out.println("E isso criou um laço de amizade entre eles, e o Dragão Alado se tornou o seu companheiro de aventuras. Assim eles começaram a trilhar o caminho para o Vulcão Ancestral.");
                                System.out.println("Durante o caminho eles evoluiram muito, os dois estavam subindo varios niveis juntos até que chegaram ao Vulcão Ancestral.");
                                System.out.println("Eles entraram no vulcão e começaram a subir até o topo, e lá eles encontraram o Feiticeiro Maligno, que estava preparando uma magia muito poderosa para destruir a Dimensão Zero.");
                                System.out.println("Assim que eles viram o Feiticeiro Maligno foram a batalha, com muito esforço e vontade de protejer a Dimensão Zero eles lutaram com todas as forças que tinham, e finalmente conseguiram destruir o mal que abitava aquela dimensão.\n ");
                                System.out.println(" Assim que o Feiticeiro foi derrotado o Mago Supremo Abriu um portal para" + classe + "conseguir voltar a sua dimensão. Mas ele escolheu continuar protegendo a Dimensão Zero.\n\n");
                                System.out.println("PARABENS"+ nome +"VOCÊ CONSEGUIU PROTEGER A DIMENSÃO ZERO, VOCÊ SE TORNOU UM HEROI MUITO RESPEITADO.\n\nFIM!!!");
                        }
                        // if todos saem vivos.

                        // if o heroi morre.

                        // Criação do primeiro if. Floresta

                        if (escolha2.equals("F")) {
                                System.out.println("Eu irei pela Floresta Negra, por que acho que poderei me aventurar bastante pelo caminho, e conseguir melhorar minhas habilidades.");
                                System.out.println("E assim o jovem" + classe+ "começou a trilhar a sua história para conseguir derrotar o Feiticeiro Maligno, e conseguir renovar a paz na Dimenssão Zero.");
                                System.out.println("Ele se despediu do Mago Supremo e começou a sua jornada.");
                                System.out.println("Ele percebeu que a cada dia mais que se passava, mas o Ovo Místico que ele tinha recebido se mexia, em meio a uma batalha muito importante o ovo começou a rachar, e dele saiu um Bazilisco que o ajudou a ganhar essa batalha.");
                                System.out.println("Assim que a batalha terminou o jovem percebeu que ele tinha se tornado mais forte, e que o Bazilisco era muito leal a ele.");
                                System.out.println("E isso criou um laço de amizade entre eles, e o Bazilisco se tornou o seu companheiro de aventuras. Assim eles começaram a trilhar o caminho para a Floresta Negra.");
                                System.out.println("Durante o caminho eles evoluiram muito, os dois estavam subindo varios niveis juntos até que chegaram a Floresta Negra.");
                                System.out.println("Eles entraram na Floresta e, lá eles encontraram o Feiticeiro Maligno, que estava preparando uma magia muito poderosa para destruir a Dimensão Zero.");
                                System.out.println("Assim que eles viram o Feiticeiro Maligno foram a batalha, com muito esforço e vontade de protejer a Dimensão Zero eles lutaram com todas as forças que tinham, e finalmente conseguiram destruir o mal que abitava aquela dimensão.\n ");
                                System.out.println(" Assim que o Feiticeiro foi derrotado o Mago Supremo Abriu um portal para" + classe + "conseguir voltar a sua dimensão. Mas ele escolheu continuar protegendo a Dimensão Zero.\n\n");
                                System.out.println("PARABENS"+ nome +"VOCÊ CONSEGUIU PROTEGER A DIMENSÃO ZERO, VOCÊ SE TORNOU UM HEROI MUITO RESPEITADO.\n\nFIM!!!");
                        }
                        // if todos saem vivos.

                        // if o heroi morre.


                            // Criação do segundo if. Montanha.

                        if (escolha2.equals("M")) {
                                System.out.println("Eu irei pela Montalhas do Desespero, por que acho que poderei me aventurar bastante pelo caminho, e conseguir melhorar minhas habilidades.");
                                System.out.println("E assim o jovem" + classe + "começou a trilhar a sua história para conseguir derrotar o Feiticeiro Maligno, e conseguir renovar a paz na Dimenssão Zero.");
                                System.out.println("Ele se despediu do Mago Supremo e começou a sua jornada.");
                                System.out.println("Ele percebeu que a cada dia mais que se passava, mas o Ovo Místico que ele tinha recebido se mexia, em meio a uma batalha muito importante o ovo começou a rachar, e dele saiu um Grifo que o ajudou a ganhar essa batalha.");
                                System.out.println("Assim que a batalha terminou o jovem percebeu que ele tinha se tornado mais forte, e que o Grifo era muito leal a ele.");
                                System.out.println("E isso criou um laço de amizade entre eles, e o Grifo se tornou o seu companheiro de aventuras. Assim eles começaram a trilhar o caminho para as Montanhas do Desespero.");
                                System.out.println("Durante o caminho eles evoluiram muito, os dois estavam subindo varios niveis juntos até que chegaram as Montanhas do Desespero");
                                System.out.println("Eles começaram a subir até o topo da montalha, e lá eles encontraram o Feiticeiro Maligno, que estava preparando uma magia muito poderosa para destruir a Dimensão Zero.");
                                System.out.println("Assim que eles viram o Feiticeiro Maligno foram a batalha, com muito esforço e vontade de protejer a Dimensão Zero eles lutaram com todas as forças que tinham, e finalmente conseguiram destruir o mal que abitava aquela dimensão.\n ");
                                System.out.println(" Assim que o Feiticeiro foi derrotado o Mago Supremo Abriu um portal para" + classe + "conseguir voltar a sua dimensão. Mas ele escolheu continuar protegendo a Dimensão Zero.\n\n");
                                System.out.println("PARABENS"+ nome +"VOCÊ CONSEGUIU PROTEGER A DIMENSÃO ZERO, VOCÊ SE TORNOU UM HEROI MUITO RESPEITADO.\n\n FIM!!!");
                        }
                        // criação do else. Vila.

                } else {
                        System.out.println("Ele descidiu não ajudar o senhor, pois estava muito concentrado em melhorar suas habilidades para conseguir sair o mais rápido daquela dimensão \n");
                        System.out.println("E tambem disse que não mexeria um unico dedo para ajudar o senhor, por que seria muita perda de tempo, e tempo era uma coisa que ele não tinha.");
                        System.out.println("Assim que teve uma oportunidade, ele tentou sair daquela floresta o mais rápido possivel, mas pouco antes dele conseguir fugir daquele local, o senhor revelou ser um mago muito poderoso, mas que já estava muito cansado por motivos da sua missão, ele não explicou oq era");
                        System.out.println("Quando" + classe + "estava quase conseguindo fugir, o mago falou que conseguiu ver oq aconteceria não presente, e amaldiçoou o jovem, e falou que ele viveria como um principe mas morreria como um animal.");
                        System.out.println("Ao escutar isso o jovem iniciou a sua jornada de treinamento, mas sempre se lembrava das ultimas palavras daquele senhor.");
                        System.out.println("Mesmo assim ele continuou trinando mais e mais, até se tornar um cavaleiro muito forte e conseguir sua felicidade.");
                        System.out.println("Mas em um certo dia que ele saiu para treinar novamente,ele notou que um exercito de inimigos estavam indo em direção da sua casa, onde a sua familia estava.");
                        System.out.println("Ele tentou voltar o mais rápido para casa, para tentar proteger a sua familia e seus tessouros que ele tanto gostava, mas assim que chegou já era tarde de mais. ");
                        System.out.println("O exercito de monstros já tinham destruido todo o vilarejo em que ele morava e ele perdeu tudo oque ele mais amava, os seus bens e sua familia. Mas por um momento ele se lembrou do senhor de algum tempo atrás e de tudo oq ele falou.");
                        System.out.println("Ele acabou se arrependendo de não ter ajudado ele, mas infelizmente já era muito tarde");
                        System.out.println("Enquanto ele pensava em tudo de ruim que fez, não se deu conta que estava sendo cercado e acabou caindo em uma armadinha, quando notou já estava de frente com O Feiticeiro Maligno que comandava aquele exercito.");
                        System.out.println("O feiticeiro falou que tudo tinha acontecido como ele tinha planejado, primeiro ele mandou executar O Mago Supremo que ficou responsavel por entregar uma arma muito poderosa ao"+ classe + " que poderia destruir ele, mas já que o Mago Supremo estava morto a um bom tempo,essa arma estava perdida com ele, e nada poderia derrotalo.\n");
                        System.out.println("E foi assim que o" + classe + "teve o seu fim pelas mãos do Feiticeiro Maligno, e morreu sem conseguir retornar a sua dimensão, e por suas escolas a Dimensão Zero foi totalmente destruida.\n\n");
                        System.out.println("Olá Evocador" + nome + "infelizmente suas escolhas levaram a esse trágico fim!!!");
                }

        }

}