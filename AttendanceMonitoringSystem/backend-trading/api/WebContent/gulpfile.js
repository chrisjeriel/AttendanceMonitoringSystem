var gulp = require('gulp');
var source = require('vinyl-source-stream');
var buffer = require('vinyl-buffer');
var browserify = require('browserify');
var reactify = require('reactify');
var babelify = require('babelify');
var uglify = require('gulp-uglify');
var sass = require('gulp-sass');
var webserver = require('gulp-webserver');
var runSequence = require('run-sequence');

gulp.task('browserify', function() {
	var bundler = browserify({
		entries: ['./scripts/src/main.js'],
		debug: true
	});
	bundler.transform(babelify, { presets: ["react"] });
	return bundler.bundle()
		.pipe(source('build.js'))
		// .pipe(buffer())
		// .pipe(uglify())
		.pipe(gulp.dest('./scripts/build'));
});

gulp.task('sass', function() {
	gulp.src(['./stylesheets/sass/*.scss'])
		.pipe(sass({
			importer: require('npm-sass').importer
		}))
		.pipe(gulp.dest('./stylesheets/css'));
});

gulp.task('watch', function() {
	gulp.watch('scripts/src/**/*.js', ['browserify']);
	gulp.watch('scripts/src/**/*.jsx', ['browserify']);
	gulp.watch('stylesheets/sass/**/*.scss', ['sass']);
});

gulp.task('webserver', function () {
    return gulp.src(['.'])
        .pipe(webserver({
            //host: '0.0.0.0',
            port: 8000,
            livereload: true,
            open: true
        }));
});

gulp.task('default', function () {
    runSequence(['browserify', 'sass'], 'webserver', 'watch');
});
