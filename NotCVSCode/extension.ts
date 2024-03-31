import * as vscode from 'vscode';

export function activate(context: vscode.ExtensionContext) {

	console.log('Congratulations, your "!C vscode extension" is now active!');

	context.subscriptions.push( 
		vscode.commands.registerCommand('notc.alloCode', () => {

			vscode.window.showInformationMessage('Allo VSCode from !C');

		})
	);
}

export function deactivate() {}
