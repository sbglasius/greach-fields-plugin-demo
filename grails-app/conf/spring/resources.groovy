import fields.demo.ConnectionChecker

beans = {
    if (ConnectionChecker.connectionAlive) {
        springConfig.addAlias 'conferenceDataService', 'onlineConferenceDataService'
    } else {
        springConfig.addAlias 'conferenceDataService', 'offlineConferenceDataService'
    }
}
