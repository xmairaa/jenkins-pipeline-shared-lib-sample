import com.ericsson.eiffel.common.rest.ERClient
import com.ericsson.eiffel.fem.config.EiffelJenkinsGlobalConfiguration
class ERClient {

    ERClient get() {
        final String erUrl = EiffelJenkinsGlobalConfiguration.get().getErRestUrl()
        println "ER URL2 ---------------------------------------"+erUrl
        return ERClient.getInstance(erUrl)
    }
}
