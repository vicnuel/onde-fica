package br.com.alura.ondefica.ui.repositories.responses

import br.com.alura.ondefica.ui.uistates.AddressFormUiState
import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


data class AddressResponse(
    val logradouro: String,
    val bairro: String,
    @Json(name = "localidade") val cidade: String,
    @Json(name = "uf") val estado: String
) {
    fun toAddressFormUiState() = AddressFormUiState(
        logradouro = logradouro,
        bairro = bairro,
        cidade = cidade,
        estado = estado,
        isLoading = false,
        isError = false
    )
}
