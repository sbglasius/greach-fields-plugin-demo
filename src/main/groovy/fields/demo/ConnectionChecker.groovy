package fields.demo

class ConnectionChecker {
    static boolean isConnectionAlive() {
        HttpURLConnection con = "http://cfp.gr8conf.org".toURL().openConnection() as HttpURLConnection
        con.setRequestMethod("HEAD")

        con.setConnectTimeout(5000) //set timeout to 5 seconds
        try {
            return con.getResponseCode() == HttpURLConnection.HTTP_OK
        } catch (ignore) {
            return false
        }
    }
}
