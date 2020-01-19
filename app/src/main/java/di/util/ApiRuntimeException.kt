package di.util

import retrofit2.HttpException
import retrofit2.Response

class ApiRuntimeException(

    override val message: String? = null,

    val errorCode: Int,

    response: Response<*>

) : HttpException(response)