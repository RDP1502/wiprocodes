import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Secondcom } from './app/secondcom/secondcom';
import { Logincom } from './app/logincom/logincom';
import { Thirdcom } from './app/thirdcom/thirdcom';

bootstrapApplication(Thirdcom, appConfig)
  .catch((err) => console.error(err));
