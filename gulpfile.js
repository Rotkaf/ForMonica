'use strict';//

var gulp = require('gulp');
var jshint = require("gulp-jshint");
var jsFiles = "./public/javascripts/app/*.js";

var sass = require("gulp-sass");
var scssPathFiles = "./public/stylesheets/app/scss/*.scss";
var destCssPath = "./public/stylesheets/app/";

var livereload = require('gulp-livereload');

gulp.task("default", ["watch-js-css"]);

gulp.task('watch-js-css', ["watch-js", "watch-scss"]);


gulp.task("jshint", function() {
    gulp.src(jsFiles)
        .pipe(jshint())
        .pipe(jshint.reporter("jshint-stylish"))
		.pipe(livereload({ start: true }));
		//.pipe(jshint.reporter("default"));
});

// uruchamia najpierw "jshint", a następnie "watch-js"
gulp.task('watch-js', ["jshint"], function() {
//gulp.task('watch-js', function() {
	livereload.listen();
    gulp.watch(jsFiles, ["jshint"]);
});



gulp.task('build-css', function() {
  return gulp.src(scssPathFiles)
    .pipe(sass())
    .pipe(gulp.dest(destCssPath))
	.pipe(livereload({ start: true }));
});

gulp.task('watch-scss', ["build-css"], function() {
//gulp.task('watch-scss', function() {
	livereload.listen();
    gulp.watch(scssPathFiles, ["build-css"]);
});