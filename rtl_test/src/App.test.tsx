import { render, screen } from "@testing-library/react";
import App from "./App";

describe("Teste para o componente principal", () => {
	test("Deve renderizar corretamente", () => {
		render(<App />);
		expect(
			screen.getByText("Olha só que legal minha miniatura do Batmóvel."),
		).toBeInTheDocument();
	});
});
