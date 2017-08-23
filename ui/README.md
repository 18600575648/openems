# OpenemsGui

This project was generated with [angular-cli](https://github.com/angular/angular-cli) version 1.0.4.
Dependencies are managed by yarn: `ng set --global packageManager=yarn` and `yarn install`.

## Development server

Run `ng serve --env=openems-backend-dev` to serve for FemsServer-Backend.

Run `ng serve` to serve for OpenEMS-Backend.

## Build using maven

Be sure to setup maven before - see description below.

Build for femsserver:

`mvn package -P femsserver`

Build for openems:

`mvn package -P openems`

If you want to build despite "Cannot create the build number because you have local modifications", add `-Dmaven.buildNumber.doCheck=false` to the command line.

### Setup Maven

1. Download zip file from https://maven.apache.org/download.cgi

2. Extract zip file somewhere (example: C:\bin\apache-maven-3.5.0)

3. Add "C:\bin\apache-maven-3.5.0\bin" to global PATH (see https://maven.apache.org/install.html for details)

## Build using angular-cli

Run `ng build` to build the project. The build artifacts will be stored in the `target` directory. Use the `-prod` flag for a production build.

Build for OpenEMS Backend:

`ng build -prod --env=backend --base-href /m/`

Build for OpenEMS Edge:

`ng build -prod --env=edge --base-href /`

## Further help

To get more help on the `angular-cli` use `ng help` or go check out the [Angular-CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

### Development hints

#### i18n - internationalization

Translation is based on [ngx-translate](https://github.com/ngx-translate). The language can be changed at runtime in the "Über FEMS-UI" dialog.

##### In HTML template use:

`<p translate>General.StorageSystem</p>`

* add attribute 'translate'
* content of the tag is the path to translation in [translate.ts](app/shared/translate.ts) file

##### In typescript code use:
```
import { TranslateService } from '@ngx-translate/core';
constructor(translate: TranslateService) {}
this.translate.instant('General.StorageSystem')
```

#### Subscribe
For "subscribe" please follow this: https://stackoverflow.com/questions/38008334/angular-rxjs-when-should-i-unsubscribe-from-subscription
```
import { Subject } from 'rxjs/Subject';
private ngUnsubscribe: Subject<void> = new Subject<void>();
ngOnInit() {
    /*subject*/.takeUntil(this.ngUnsubscribe).subscribe(/*variable*/ => {
        ...
    });
}
ngOnDestroy() {
    this.ngUnsubscribe.next();
    this.ngUnsubscribe.complete();
}
```