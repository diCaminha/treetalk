package br.com.caelum.ichat.callback;

import br.com.caelum.ichat.modelo.Mensagem;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by denis on 23/10/17.
 */

public class EnviarMensagensCallback implements Callback<Mensagem> {
    @Override
    public void onResponse(Call<Mensagem> call, Response<Mensagem> response) {

    }

    @Override
    public void onFailure(Call<Mensagem> call, Throwable t) {

    }
}
