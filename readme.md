
1. 整合vue前端工程和springboot后端工程到一个项目里面
2. 通过修改maven构建过程，调用vue前端构建，并把构建之后的文件和静态资源复制到对应的目录
   1. dist内index.html复制到 srv/main/resources/templates
   2. dist内其他静态资源复制到 srv/main/resources/static
3. clean 过程会删除上述生成的文件， 不影响下次打包


## 执行maven clean package 
```sh 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.925 s - in com.demo.mvc.DemoMvcApplicationTests
2022-07-03 12:20:54.694  INFO 2808 --- [       Thread-2] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- exec-maven-plugin:1.6.0:exec (build frontend --install) @ demo-mvc ---
yarn install v1.19.1
[1/4] Resolving packages...
success Already up-to-date.
Done in 0.60s.
[INFO] 
[INFO] --- exec-maven-plugin:1.6.0:exec (build frontend --build) @ demo-mvc ---
yarn run v1.19.1
$ vue-cli-service build

-  Building for production...
 DONE  Compiled successfully in 1947ms12:21:01

  File                                 Size               Gzipped

  dist\js\chunk-vendors.01e23301.js    69.42 KiB          25.06 KiB
  dist\js\app.2b704807.js              4.40 KiB           1.59 KiB
  dist\css\app.fb0c6e1c.css            0.33 KiB           0.23 KiB

  Images and other types of assets omitted.

 DONE  Build complete. The dist directory is ready to be deployed.
 INFO  Check out deployment instructions at https://cli.vuejs.org/guide/deployment.html
      
Done in 6.40s.
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:copy-resources (copy front-end template to target) @ demo-mvc ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:copy-resources (copy front-end assets to target) @ demo-mvc ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 7 resources
[INFO] 
[INFO] --- maven-jar-plugin:3.1.1:jar (default-jar) @ demo-mvc ---
[INFO] Building jar: E:\Liang\Desktop\demo-mvc\target\demo-mvc-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.1.2.RELEASE:repackage (repackage) @ demo-mvc ---
[INFO] Replacing main artifact with repackaged archive
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  15.332 s
[INFO] Finished at: 2022-07-03T12:21:04+08:00
[INFO] ------------------------------------------------------------------------

```