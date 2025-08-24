import { bootstrapApplication } from '@angular/platform-browser';
import { App } from './Components/app/app';
import { appConfig } from './Components/app/app.config';


bootstrapApplication(App, appConfig)
  .catch((err) => console.error(err));
