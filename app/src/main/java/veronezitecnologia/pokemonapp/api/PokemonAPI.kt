package veronezitecnologia.pokemonapp.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import veronezitecnologia.pokemonapp.model.Pokemon

interface  PokemonAPI {
    @GET("/api/v2/pokemon/{id}/")
    fun getPokemon(@Path("id") pokemonId: Int):Call<Pokemon>


}