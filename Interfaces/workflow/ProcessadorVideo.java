

import java.util.ArrayList;

public class ProcessadorVideo {

    ArrayList<CanalNotificacao>canais ;

    public ProcessadorVideo() {
        canais = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacao canalNotificacao){
        canais.add(canalNotificacao);
    }

    public void processar(Video video){
        for (CanalNotificacao canal: canais) {
            canal.notificar(new Mensagem(video.getArquivo()+" - "+video.getFormatoVideo(), TipoMensagem.LOG));

        }

    }
}
