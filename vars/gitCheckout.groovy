def call(Map stageParams) {

    checkout([
        $class: 'GitSCM',
        branches: [[name: stageParams.branch ]], // fetching branch
        userRemoteConfigs: [[ url: stageParams.url]] // fetching github URL
    ])
}