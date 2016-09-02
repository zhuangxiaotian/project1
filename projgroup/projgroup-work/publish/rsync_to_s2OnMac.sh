ssh -p 12222 topdeep@test.topdeep.cn "/home/topdeep/server/apache-tomcat-6.0.32/bin/shutdown.sh"
rsync -czrtopg -e "ssh -p 12222" --exclude=**/.svn --delete --progress "/Users/niexin/project/source/projgroup/dist/" "topdeep@test.topdeep.cn:/home/topdeep/projgroup/"
ssh -p 12222 topdeep@test.topdeep.cn "/home/topdeep/server/apache-tomcat-6.0.32/bin/startup.sh"