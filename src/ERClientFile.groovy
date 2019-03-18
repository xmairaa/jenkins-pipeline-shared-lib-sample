import com.ericsson.eiffel.common.rest.ERClient
import com.ericsson.eiffel.fem.config.EiffelJenkinsGlobalConfiguration
class ERClientFile {

    ERClient get() {
        final String erUrl = EiffelJenkinsGlobalConfiguration.get().getErRestUrl()
        println "ER URL from ERClientFile ---------------------------------------"+erUrl
        return ERClient.getInstance(erUrl)
    }
}
