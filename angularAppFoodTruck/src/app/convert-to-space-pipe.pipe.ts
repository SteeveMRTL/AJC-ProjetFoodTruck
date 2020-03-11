import { Pipe, PipeTransform } from '@angular/core';
import { ValueConverter } from '@angular/compiler/src/render3/view/template';

@Pipe({
  name: 'convertToSpacePipe'
})
export class ConvertToSpacePipePipe implements PipeTransform {


  // transform(value: String, character: string): string {

  //   return value.replace(character,' ');
  // }

  transform(value: String, character: string): string {

    return value.replace(new RegExp(character,'g'),' ');
  }

  // transform(value: String, character: string): string {
  //   let tmp:string=value.replace(character,' ');
  //   if(tmp==value)
  //     return tmp;
  //   return this.transform(tmp,character);
  // }

}
