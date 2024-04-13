
    package prin;


    public class Televisor {

        int canal = 5;
        boolean ligado;
        int volume = 100;

        public Televisor(int canal, boolean ligado, int volume) {
            this.canal = canal;
            this.ligado = ligado;
            this.volume = volume;
        }

            Televisor(){}


         public int reduzirVolume(int volume){

            if(volume < 100){

                System.out.println("O volume está abaixo de seu máximo");
            }else{

                System.out.println("O volume está no máximo");
            }
            return 0;
        }

        void ligado() {

          if(ligado){

               System.out.println("A TV está ligada");

          }else{
              
              System.out.println("A TV está desligada");
          }




        }



        void canal() {

            if(canal < 5){

                System.out.println("Esta descendo canais");

                }else{

                 System.out.println("Escolha um canal [1 a 5]");
            }

        }


        void volume() {

                if(volume > 0){

                    System.out.println("O volume está em: " +volume);
                        }else{

                        System.out.println("O volume permanece no zero");
                    }

        }


           public void MostrarStatus(){

               System.out.println("A TV está no canal: " +canal);
               System.out.println("A TV está em: " +volume);
               



        }






     public int getCanal() {
            return canal;
        }

        public void setCanal(int canal) {
            this.canal = canal;
        }

        public boolean isLigado() {
            return ligado;
        }

        public void setLigado(boolean ligado) {
            this.ligado = ligado;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }





    }
