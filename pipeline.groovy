pipelineJob('example') {
           stringParam {
            name('FolderName')
            defaultValue('Avhana-Prod')
            description('''The name of the folder, where jobs will be created - this is based on the Release environment name
eg: KIBO-master, KIBO-Release etc.''')
            trim(false)
        }
}
